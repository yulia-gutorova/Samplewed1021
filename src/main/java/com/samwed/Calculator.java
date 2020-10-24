package com.samwed;

public class Calculator
{
    private int x, y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getSum()
    {
        return this.x+this.y;
    }

    public int getDivide()
    {
        return this.x/this.y;
    }

    public int getMultiple()
    {
        return this.x*this.y;
    }

    public int getSubtract()
    {
        return this.x-this.y;
    }
}