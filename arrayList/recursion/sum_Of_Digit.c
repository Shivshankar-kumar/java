#include<stdio.h>
int sum_Of_Digit(int range,int sum){
    printf("Enter the %d Elemnet: ",range);
    int digit;
    for(int i=0; i<range; i++){
        scanf("%d",&digit);
        sum+=digit;
    }
    return sum;
}
int main(){
    int range;
    printf("Enter the Range Of Digit: ");
    scanf("%d",&range);
    int ans=sum_Of_Digit(range,0);
    printf("Sum of Total Digit is = %d",ans);
    return 0;
}