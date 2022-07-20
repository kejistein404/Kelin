package com.codepractice.kelin.customView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;


//滑动按钮
public class SlideView extends LinearLayout {

    private SwipeListener swipeListener;
    private int mDownX;
    private int mDownY;
    private int totalMoveX;
    private boolean isSliding;
    private int mTouchSlop;
    private int mTempX;

    public SlideView(Context context) {
        super(context);
    }

    public SlideView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTouchSlop(context);
    }

    public SlideView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void setTouchSlop(Context context){
        mTouchSlop=ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public  void setSwipeListener(SwipeListener swipeListener){
        this.swipeListener=swipeListener;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mDownX = mTempX = (int) ev.getRawX();
                mDownY = (int) ev.getRawY();
                break;
            case MotionEvent.ACTION_MOVE:
                int moveX = (int) ev.getRawX();
                if (Math.abs(moveX - mDownX) > mTouchSlop && Math.abs((int) ev.getRawY() - mDownY) < mTouchSlop) {
                    return true;
                }
                break;
        }

        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_MOVE:
                int moveX = (int) event.getRawX();
                int deltaX = mTempX - moveX;
                mTempX = moveX;
                if (Math.abs(moveX - mDownX) > mTouchSlop && Math.abs((int) event.getRawY() - mDownY) < mTouchSlop) {
                    isSliding = true;
                }

                if (Math.abs(moveX - mDownX) >= 0 && isSliding) {
                    totalMoveX += deltaX;
                }
                break;
            case MotionEvent.ACTION_UP:
                isSliding = false;
                //右滑动作
                if (Math.abs(totalMoveX) >= this.getWidth()/ 2&&totalMoveX<0) {
                    //滑动事件回调
                    swipeListener.onSwipe();
                }
                totalMoveX = 0;
                break;
        }

        return true;
    }


    public interface SwipeListener {
        void onSwipe();
    }

}
