package com.company;

public class DynamicStack extends customStack{
    public DynamicStack(){
        super(); //it will call customStack()
    }
    public DynamicStack(int size){
        super(size);
    }
    @Override
    public boolean push(int item){
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length * 2];
            //copy all previous items in new data
            for (int i = 0; i < data.length ; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        //at this point array is not full
        //insert item
        return super.push(item);
    }

}
