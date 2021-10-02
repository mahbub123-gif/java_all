package quiz;
public class quiz5{
public static void main(String args[]){
//creating two matrices
int m1[][]={{4,5,6,7},{14,15,16,17}};
int m2[][]={{2,3,4,5},{9,10,11,12}};
System.out.println(m1);
System.out.println("\n"+m2);
int m[][]=new int[2][2]; //3 rows and 3 columns
//multiplying
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
m[i][j]=0;
for(int k=0;k<2;k++)
{
m[i][j]+=m1[i][k]*m2[k][j];
}
//end of k loop
System.out.print(m[i][j]+" "); //printing matrix
}
//end of j loop
System.out.println();
}
}}