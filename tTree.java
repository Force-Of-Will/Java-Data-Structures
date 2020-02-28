public class tTree{
   private int data;
   public tTree l, m, r;
   
   public tTree(){data = 0; l = null; m = null; r = null;}//no-param const
   
   public tTree(int i){data = i; l = null; m = null; r = null;}//single param const
   
   public void setL(tTree myL){this.l = myL;}//l modifier
   
   public void setR(tTree myR){this.r = myR;}//r modifier
   
   public void setM(tTree myM){this.m = myM;}//m modifier
   
   public int getData(){return this.data;}//data return
   
   public static int getSum(Object myTree){
      tTree tree = new tTree();
      if(myTree == null) return 0;
      else if(myTree instanceof tTree) tree = (tTree)myTree;
      return(tree.data + getSum(tree.l) + getSum(tree.m) + getSum(tree.r));
   }//getSum() sum all elements in the tTree
   
   public static int countNodes(Object myTree){
      tTree tree = new tTree();
      if(myTree == null) return 0;
      else if(myTree instanceof tTree) tree = (tTree)myTree;
      return(1 + countNodes(tree.l) + countNodes(tree.m) + countNodes(tree.r));
   }//counts the number of nodes in tTree

   public static void main(String[] args){
      tTree myTree = new tTree(4);
      System.out.println(myTree.getData());
      System.out.println(getSum(myTree));
      
      tTree myLeft = new tTree(1);
      tTree myRight = new tTree(3);
      tTree myMid = new tTree(5);
      
      myTree.setL(myLeft);
      System.out.println(getSum(myTree));
      System.out.println("number of nodes is " + countNodes(myTree));
      myTree.setR(myRight);
      System.out.println(getSum(myTree));
      System.out.println("number of nodes is " + countNodes(myTree));
      myTree.setM(myMid);
      System.out.println(getSum(myTree));
      System.out.println("number of nodes is " + countNodes(myTree));
   }//end main
}//end class tTree