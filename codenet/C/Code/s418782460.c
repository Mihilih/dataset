#pragma warning(disable:4996)
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>
#define MAX_STRING 30
#define MAX_LINE 2000000
#define MAX_HUMAN 200000

char sLongInputLine[MAX_LINE+1]="";
int  anComingSec[MAX_HUMAN];

int main() {

	char sInput[MAX_STRING+1]="";
	char* psWord=NULL;
	char* psInput=NULL;

	int nHumanNumber=0;
	int nNextHumanIndex=0;
	int nWaterLength=0;
	int nWaterLife=0;
	int nStart=0;
	int nStop=0;

	int nIndex=0;
	int i=0;
	int j=0;

	// read line 1
	fgets(sInput,MAX_STRING,stdin);
	if (strchr(sInput, '\n') != NULL) {
	    sInput[strlen(sInput) - 1] = '\0';
	}
	psInput = strtok(sInput, " ");
	nHumanNumber = atoi(psInput);
	psInput = strtok(NULL, " ");
	nWaterLength = atoi(psInput);

	fgets(sLongInputLine,MAX_LINE,stdin);
	if (strchr(sLongInputLine, '\n') != NULL) {
		sLongInputLine[strlen(sLongInputLine) - 1] = '\0';
	}
	psInput = strtok(sLongInputLine, " ");
	for (i=0;i<nHumanNumber;i++){
		anComingSec[i]=atoi(psInput);
		psInput = strtok(NULL, " ");
	}

	nStart = anComingSec[0];

	while(nNextHumanIndex<nHumanNumber){
		if (nNextHumanIndex == nHumanNumber){
			break;
		} else {
			nStop=nStart+nWaterLength;
			if (anComingSec[nNextHumanIndex]<nStop){
				while(nNextHumanIndex<nHumanNumber && anComingSec[nNextHumanIndex] < nStop){
					if (nStop <= anComingSec[nNextHumanIndex]+nWaterLength){
						nStop = anComingSec[nNextHumanIndex]+nWaterLength;
						nNextHumanIndex++;
					}
				}
				if (nNextHumanIndex == nHumanNumber){
					nWaterLife = nWaterLife + (nStop-nStart);
					break;
				}
			}
			nWaterLife = nWaterLife + (nStop-nStart);
			nStart=nStop;
			if (nStart<anComingSec[nNextHumanIndex]){
				nStart=anComingSec[nNextHumanIndex];
			}
		}
	}
	printf("%d\n",nWaterLife);

	return 0;

}
