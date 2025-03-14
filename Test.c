#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* left;
    struct Node* right;
};

struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

struct Node* insert(struct Node* root, int data) {
    if (root == NULL) {
        return createNode(data);
    }
    if (data < root->data) {
        root->left = insert(root->left, data);  // Corrected here
    } else if (data > root->data) {
        root->right = insert(root->right, data); // Corrected here
    } else {
        printf("Element already exists!\n");
    }
    return root;
}

void inorder(struct Node* root) {
    if (root == NULL) {
        return;
    }
    inorder(root->left);
    printf("%d\t", root->data);
    inorder(root->right);
}

int main() {
    int ch, data;
    struct Node* root = NULL;
    do {
        printf("\n1. Insert\n");
        printf("3. Inorder\n");
        printf("4. Exit\n");

        printf("Enter your choice: ");
        scanf("%d", &ch);

        switch (ch) {
            case 1:
                printf("Enter the element to insert: ");
                scanf("%d", &data);
                root = insert(root, data);
                break;
            case 3:
                printf("In-order traversal:\n");
                inorder(root);
                printf("\n");
                break;
            case 4:
                printf("Exiting..\n");
                break;
            default:
                printf("Invalid choice, try again.\n");
        }
    } while (ch != 4);

    return 0;
}

