#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define U1 unsigned char
#define S1 char
#define	S4 int
#define DU double
#define VD void

#define COMMAND_LENGTH     (10)   /* 命令の文字数 */

typedef struct st_node ST_NODE;
typedef struct st_node
{
	ST_NODE* st_parent;
	ST_NODE* st_left;
	ST_NODE* st_right;
	S4 s4_key;
};

VD vd_d_insert(ST_NODE**, S4);
VD vd_d_print(ST_NODE*);
static VD vd_s_printPreOrder(ST_NODE*);
static VD vd_s_printInOrder(ST_NODE*);
ST_NODE* st_dp_newST_NODE(S4);

S4 main()
{
	ST_NODE* st_tp_root;
	S4 s4_t_numCommand;
	S4 s4_t_iCommand;
	S1 s1_tp_command[COMMAND_LENGTH];
	S4 s4_t_insertKey;
	S4 s4_t_RtnStrcmp;

	st_tp_root = (ST_NODE*)NULL;

	//命令数
	(VD)scanf("%d", &s4_t_numCommand);

	//コマンド実行
	for (s4_t_iCommand = (S4)0; s4_t_iCommand < s4_t_numCommand; s4_t_iCommand++)
	{
		//TODO コマンドにより引数が異なる問題
		//コマンド(insert or print)
		(VD)scanf("%s", s1_tp_command);

		//コマンドの実行
		//isertとprintfしか入力されない前提で作成
		//コマンドの種類を増やす場合、print用のelse if文を追加すること。
		s4_t_RtnStrcmp = (S4)strcmp(s1_tp_command, "insert");
		if (s4_t_RtnStrcmp == (S4)0)
		{
			//insertならキーの値を取得
			(VD)scanf("%d", &s4_t_insertKey);
			vd_d_insert(&st_tp_root, s4_t_insertKey);
		}
		else
		{
			vd_d_print(st_tp_root);
		}
	}

	return((S4)0);
}


VD vd_d_insert(ST_NODE** st_ap2_root, S4 s4_a_key)
{
	ST_NODE* st_tp_parentNode;
	ST_NODE* st_tp_indexNode;
	ST_NODE* st_tp_insertNode;

	st_tp_insertNode = st_dp_newST_NODE(s4_a_key);

	st_tp_parentNode = (ST_NODE*)NULL;
	st_tp_indexNode = *st_ap2_root;

	while (st_tp_indexNode != (ST_NODE*)NULL)
	{
		st_tp_parentNode = st_tp_indexNode;
		if (st_tp_insertNode->s4_key < st_tp_indexNode->s4_key)
		{
			st_tp_indexNode = st_tp_indexNode->st_left;
		}
		else
		{
			st_tp_indexNode = st_tp_indexNode->st_right;
		}
	}
	st_tp_insertNode->st_parent = st_tp_parentNode;

	if (st_tp_parentNode == (ST_NODE*)NULL)
	{
		*st_ap2_root = st_tp_insertNode;
	}
	else if (s4_a_key < st_tp_parentNode->s4_key)
	{
		st_tp_parentNode->st_left = st_tp_insertNode;
	}
	else
	{
		st_tp_parentNode->st_right = st_tp_insertNode;
	}
}

VD vd_d_print(ST_NODE* st_ap_root)
{
	vd_s_printInOrder(st_ap_root);
	printf("\n");
	vd_s_printPreOrder(st_ap_root);
	printf("\n");
}

//st_ap_node…探索開始ノード
static VD vd_s_printPreOrder(ST_NODE* st_ap_node)
{
	if (st_ap_node == (ST_NODE*)NULL)
	{
		return;
	}

	printf(" %d", st_ap_node->s4_key);
	vd_s_printPreOrder(st_ap_node->st_left);
	vd_s_printPreOrder(st_ap_node->st_right);
}

//st_ap_node…探索開始ノード
static VD vd_s_printInOrder(ST_NODE* st_ap_node)
{
	static s4_s_printedNumNode = (S4)0;

	if (st_ap_node == (ST_NODE*)NULL)
	{
		return;
	}

	vd_s_printInOrder(st_ap_node->st_left);
	printf(" %d", st_ap_node->s4_key);
	vd_s_printInOrder(st_ap_node->st_right);
}

//ST_NODEのコンストラクタもどき
ST_NODE* st_dp_newST_NODE(S4 s4_a_key)
{
	ST_NODE* st_tp_node;
	st_tp_node = (ST_NODE*)malloc(sizeof(ST_NODE));
	st_tp_node->st_parent = (ST_NODE*)NULL;
	st_tp_node->st_left = (ST_NODE*)NULL;
	st_tp_node->st_right = (ST_NODE*)NULL;
	st_tp_node->s4_key = s4_a_key;

	return(st_tp_node);
}

