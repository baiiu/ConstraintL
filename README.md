## ConstraitLayout

### 约束
每个控件的约束都分为垂直和水平两类，一共可以在四个方向上给控件添加约束，必须要在横、竖方向添加约束。

1. 子控件和子控件之间的约束
2. 子控件和父控件的约束
3. 子控件和Guideline的约束


layout_constraintLeft_toLeftOf          // 左边左对齐
layout_constraintLeft_toRightOf         // 左边右对齐
layout_constraintRight_toLeftOf         // 右边左对齐
layout_constraintRight_toRightOf        // 右边右对齐
layout_constraintTop_toTopOf            // 上边顶部对齐
layout_constraintTop_toBottomOf         // 上边底部对齐
layout_constraintBottom_toTopOf         // 下边顶部对齐
layout_constraintBottom_toBottomOf      // 下边底部对齐
layout_constraintBaseline_toBaselineOf  // 文本内容基准线对齐
layout_constraintStart_toEndOf          // 起始边向尾部对齐
layout_constraintStart_toStartOf        // 起始边向起始边对齐
layout_constraintEnd_toStartOf          // 尾部向起始边对齐
layout_constraintEnd_toEndOf            // 尾部向尾部对齐



## 参考

[官方文档](https://developer.android.com/reference/android/support/constraint/ConstraintLayout)

[ConstraintLayout拖拽教程](https://blog.csdn.net/guolin_blog/article/details/53122387)
[ConstraintLayout编写教程](https://blog.csdn.net/lmj623565791/article/details/78011599)

性能分析:
[解析ConstraintLayout的性能优势](https://mp.weixin.qq.com/s/gGR2itbY7hh9fo61SxaMQQ)
[ConstraintLayout UI性能分析](https://www.cnblogs.com/liujingg/p/7161319.html)

简单或者轻度嵌套继续使用传统布局（优先选择LinearLayout），涉及到复杂布局及深度嵌套，ConstraintLayout更方便，性能也能体现出来优势。

FrameLayout > LinearLayout > RelativeLayout


