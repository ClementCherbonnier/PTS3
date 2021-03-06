package com.iutlaval.myapplication.Video.Drawables;

import android.graphics.Canvas;
import android.graphics.Paint;

import androidx.annotation.NonNull;

/**
 * crée un drawable qui s'auto suprime
 */
public class DrawableSelfRemoving extends Drawable{

    private Drawable drawable;
    private long lifespan;

    /**
     *
     * @param drawable drawable a afficher
     * @param lifespan durée en seconde que le drawable va survivre
     */
    public DrawableSelfRemoving(Drawable drawable,int lifespan) {
        super(drawable.getX(), drawable.getY(), drawable.getName());
        this.drawable = drawable;
        this.lifespan = System.currentTimeMillis()+lifespan*1000;
    }

    @Override
    public void drawOn(@NonNull Canvas c, @NonNull Paint p) {
        if(!isDone())
        {
            drawable.drawOn(c,p);
        }
    }

    public boolean isDone()
    {
        return lifespan < System.currentTimeMillis();
    }
}
