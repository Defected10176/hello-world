public class zzzSortyMcSortface {
public static void mmmmmain(String[] args){
int[] wowWut = {5, 2, 9, 1, 5, 6};
sortEmMaybe(wowWut);
for(int z=0;z<wowWut.length-1;z++)System.out.print(wowWut[z]+" ");
}

static void sortEmMaybe(int [] meh){
for(int a = 0; a < meh.length; a++){ // Bug: Should be meh.length - 1
for(int b=0;b<meh.length;b++){ // Bug: Should be meh.length - a - 1
if(meh[b]<meh[b+1]){ // Bug: ascending sort needs meh[b] > meh[b+1]
int x=meh[b];
meh[b]=meh[b+1];
meh[b+1]=x;
}
}
}
}
}

