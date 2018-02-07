# AlgorithmAndDataStructure
算法与数据结构记录

### [Red and Black Tree](https://github.com/Zychaowill/AlgorithmAndDataStructure/tree/master/src/main/java/zychaowill/datastructure/basic/tree/rb)

### Heap

- [MinHeadHeap](https://github.com/Zychaowill/AlgorithmAndDataStructure/tree/master/src/main/java/zychaowill/datastructure/basic/heap)

- [HeapSort](https://github.com/Zychaowill/AlgorithmAndDataStructure/tree/master/src/main/java/zychaowill/algorithm/newsort/heap)

### 快速排序算法

- 时间复杂度（nlog2(n)）

- 算法思想：分而治之

  QuickSort伪代码:
  ```bash
  QuickSort(A, low, high)
    if low < high
      then q = Partition(A, low, high)
           QuickSort(A, low, q - 1)
           QuickSort(A, q + 1, high)

  ```

  Partition伪代码:
  ```bash
  Partition(A, low, high)
    base <- A[high]
    i <- low - 1
    for j <- p to high - 1
        do if A[j] <= base
              then i <- i + 1
                    swap A[i] <-> A[j]
    swap A[i + 1] <-> A[high]
    return i + 1
  ```

- 代码实现: [快速排序代码实现](https://github.com/Zychaowill/AlgorithmAndDataStructure/blob/master/src/main/java/zychaowill/algorithm/sort/QuickSort.java)

### 插入排序算法

- 直接插入排序

- 折半插入排序

- 希尔排序

- 代码实现: [插入排序代码实现](https://github.com/Zychaowill/AlgorithmAndDataStructure/blob/master/src/main/java/zychaowill/algorithm/sort/InsertSort.java)
