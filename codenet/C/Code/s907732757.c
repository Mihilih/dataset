#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct _node
{
    int key;
    struct _node *next;
    struct _node *prev;
} node;

node *head;

node *makenode(int);
void insert(int);
void delete(int);
void deleteFirst();
void deleteLast();

int main()
{
    int i, n, a;
    char op[16];
    node *x;
    
    head = makenode(0);
    head->next = head;
    head->prev = head;
    
    scanf("%d", &n);
    for(i=0; i<n; i++)
    {
        scanf("%s", op);
        if(strcmp(op, "insert") == 0)
        {
            scanf("%d", &a);
            insert(a);
        }
        else if(strcmp(op, "delete") == 0)
        {
            scanf("%d", &a);
            delete(a);
        }
        else if(strcmp(op, "deleteFirst") == 0)
        {
            deleteFirst();
        }
        else if(strcmp(op, "deleteLast") == 0)
        {
            deleteLast();
        }
    }
    
    x = head;
    while(x->next != head)
    {
        printf("%d", x->next->key);
        x = x->next;
        if(x->next != head)
        {
            printf(" ");
        }
    }
    printf("\n");

    return 0;
}



node *makenode(int a)
{
    node *x;
    x = malloc(sizeof(node));
    x->key = a;
    return x;
}
void insert(int a)
{
    node *x;
    x = makenode(a);
    x->next = head->next;
    head->next->prev = x;
    head->next = x;
    x->prev = head;
}
void delete(int a)
{
    node *x;
    x = head;
    
    while(x->next != head)
    {
        x = x->next;
        if(x->key == a)
        {
            x->prev->next = x->next;
            x->next->prev = x->prev;
            free(x);
            break;
        }
    }
}
void deleteFirst()
{
    node *x;
    x = head->next;
    head->next = x->next;
    x->next->prev = head;
    free(x);
}
void deleteLast()
{
    node *x;
    x = head->prev;
    head->prev = x->prev;
    x->prev->next = head;
    free(x);
}