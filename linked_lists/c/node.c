#include <stdlib.h>

struct Node
{
    void *data;
    struct Node *next;
    struct Node *prev;
}

void insert(struct Node **head, void *data, size_t data_size)
{
    //TODO: Implement Linked List insertion at the end of the list
}

void insert_at(struct Node **head, void *data, size_t data_size, int index)
{
    //TODO: Implement Linked List insertion at given index
}

void delete(struct Node **head, void *data)
{
    //TODO: Implement Linked List Deletion
}

void* get(struct Node **head, int index)
{
    //TODO: Implement access by index
}

Node* search(struct Node **head, void* data)
{
    //TODO: Search for Node with given data and return that node, else return null
}

void reverse(struct Node **head)
{
    //TODO: Reverse a linked list
}

void sort(struct Node **head)
{
    //TODO: Sort a linked list
}

