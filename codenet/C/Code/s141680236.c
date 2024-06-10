#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void push(int);
int pop();

int top,kinbo[1000];

int main()
{
  int chonda,yamagami;
  top = 0;
  char null[100];

  while(scanf("%s",null) != EOF)
    {
      if(null[0] == '+')
	{
	  chonda = pop();
	  yamagami = pop();
	  push(chonda + yamagami);
	}
      else if(null[0] == '-')
	{
	    yamagami = pop();
	    chonda = pop();
	    push(chonda - yamagami);
	}
      else if(null[0] == '*')
	{
	   chonda = pop();
	   yamagami = pop();
	   push(chonda * yamagami);
	}
      else
	push(atoi(null));
    }

  printf("%d\n",pop());

  return 0;
}

void push(int chonda)
{
  kinbo[++top] = chonda;
}

int pop()
{
  top--;
  return kinbo[top + 1];
}

