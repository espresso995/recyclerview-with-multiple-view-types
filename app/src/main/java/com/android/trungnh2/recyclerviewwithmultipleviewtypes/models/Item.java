package com.android.trungnh2.recyclerviewwithmultipleviewtypes.models;

public class Item {

    private int type;
    private Object object;

    public int getType() {
        return type;
    }

    public Object getObject() {
        return object;
    }

    public Item(int type, Object object) {
        this.type = type;
        this.object = object;
    }
}
