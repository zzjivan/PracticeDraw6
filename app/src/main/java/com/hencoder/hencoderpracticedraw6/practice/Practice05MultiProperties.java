package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageView;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice05MultiProperties extends ConstraintLayout {
    Button animateBt;
    ImageView imageView;
    boolean flag = true;

    public Practice05MultiProperties(Context context) {
        super(context);
    }

    public Practice05MultiProperties(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice05MultiProperties(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setScaleX(0);
        imageView.setScaleY(0);
        imageView.setAlpha(0f);
        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO 在这里处理点击事件，同时对多个属性做动画
                ViewPropertyAnimator viewPropertyAnimator = imageView.animate();
                if (flag) {
                    viewPropertyAnimator.translationX(600);
                    viewPropertyAnimator.scaleX(1);
                    viewPropertyAnimator.scaleY(1);
                    viewPropertyAnimator.alpha(1);
                    viewPropertyAnimator.rotation(360);
                } else {
                    viewPropertyAnimator.translationX(0);
                    viewPropertyAnimator.scaleX(0);
                    viewPropertyAnimator.scaleY(0);
                    viewPropertyAnimator.alpha(0);
                    viewPropertyAnimator.rotation(0);
                }
                flag = !flag;
            }
        });
    }
}
