public enum BedroomType {
    SINGLE(1),
    DOUBLE(2);

    private final int type;

    BedroomType(int type){
        this.type = type;
    }

    public int getType(){
        return this.type;
    }
}



