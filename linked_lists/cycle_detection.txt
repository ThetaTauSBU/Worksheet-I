A linked list is said to contain a cycle if any node is visited more than once while traversing the list.

Given a linked list, check if the linked list has cycle or not. Your function will take in the head of the linked list as a parameter and output true if there is a cycle. False if there is not a cycle.

head -> 1 -> 2 -> 3     output: true
             ^    |
             |    v
             5 <- 4
head -> 1 -> 2 ->3 -> NULL output: false
