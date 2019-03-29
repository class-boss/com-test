package com.qihe5.SingletonPattern;

public class ChocolateBoiler {
    private boolean empty;
    private boolean bolied;

    public ChocolateBoiler(){
        empty = true;
        bolied= false;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            bolied = false;
        }
    }

    public void drain(){
        if(!isEmpty()&&isBolied()){
            //排出煮沸的巧克力和牛奶
            empty=true;
        }
    }

    public void boil(){
        if(!isEmpty() && !isBolied()){
            //奖炉内物煮沸
            bolied =true;
        }
    }


    public boolean isEmpty() {
        return empty;
    }

    public boolean isBolied() {
        return bolied;
    }
}
