public class methodscope {
    public void display(){
        int n = 5;
        System.out.println("n"+n);
    }//n is destroyed when display ( finishes)
    public void anothermethod(){
        //System.out.println(n);//error: n is out of scope here
    }
}


