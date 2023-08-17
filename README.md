# 数据结构与算法学习

数据结构:链表、二叉树、并查集、图等

算法:排序算法、贪心算法、递归—动态规划、单调栈、滑动窗口、KMP、bfprt、Manacher、Morris、线段树等

## 一、评价算法优劣的核心指标

时间复杂度和空间复杂度是计算算法效率的两个重要指标。

**时间复杂度**：时间复杂度（Time Complexity）是衡量算法执行时间随输入规模增长而增长的度量。 它表示算法执行所需的时间与问题规模之间的关系。通常用大O符号（O）来表示时间复杂度。`（通俗的说就是判断一个算法流程做了多少次常数操作）`

常见的时间复杂度有：

O(1)：常数时间复杂度，表示算法的执行时间是一个常数，与输入规模无关。

O(logN)：对数时间复杂度，表示算法的执行时间与输入规模的对数成正比。

O(N)：线性时间复杂度，表示算法的执行时间与输入规模成正比。

O(N^2)：平方时间复杂度，表示算法的执行时间与输入规模的平方成正比。

O(2^N)：指数时间复杂度，表示算法的执行时间以指数方式增长。

**空间复杂度**：空间复杂度（Space Complexity）是衡量算法所需的额外空间随输入规模增长而增长的度量。它表示算法执行所需的额外空间与问题规模之间的关系。也使用大O符号（O）来表示空间复杂度。`（通俗的说就是判断一个算法流程需要开辟多少的内存空间）`

常见的空间复杂度有：

O(1)：常数空间复杂度，表示算法的执行所需的额外空间是一个常数，与输入规模无关（有限几个变量）。

O(N)：线性空间复杂度，表示算法的执行所需的额外空间与输入规模成正比（一个等长的数组）。

O(N^2)：平方空间复杂度，表示算法的执行所需的额外空间与输入规模的平方成正比。

## 二、排序算法

### 简单排序（冒泡、选择、插入）

#### 冒泡排序
数组中相邻两个元素依次比较大小，如果满足条件（前一个元素大于或小于后一个元素），就进行交换，进行完一轮后就可以确定一个位置的最终位置，进行完`N`轮后整个数组就做到有序。

![img.png](img.png)

因为要进行`N`轮比较,每轮又需要`N`级别（N-1、N-2、N-3......）比较交换，所以冒泡排序的`时间复杂度为O(N^2)`

只需要用到有限几个额外变量就可以完成交换，所以冒泡排序的`空间复杂度为O(1)`

因为相邻元素两两交换排序，相同元素的相对位置不会改变，所以`冒泡排序具有稳定性`。
#### 选择排序

#### 插入排序

### 二分查找（基础）

### 归并排序

### 快速排序

### 堆排

### 桶排序（计数和基数）

#### 计数排序

#### 基数排序






