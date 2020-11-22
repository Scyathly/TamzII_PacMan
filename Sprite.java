package com.example.pacman;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Sprite {

    private double x;
    private double y;
    private double xVel = 0;
    private double yVel = 2;

    private PacmanView view;
    private Bitmap bmp;

    public Sprite(PacmanView view, Bitmap bmp){
        this.view = view;
        this.bmp = bmp;
    }

    public void Update(){
        x += xVel;
        y += yVel;

        if(y >= view.getHeight() - bmp.getHeight() || y <= 0){
            yVel *= -1;
        }
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void Draw(Canvas canvas){
        canvas.drawBitmap(bmp, (int)x, (int)y, null);
    }

}