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

struct Node* minValueNode(struct Node* root) {
    struct Node* curr = root;
    while (curr != NULL && curr->left!=NULL) {
    	curr = curr->left;
    }

    return curr;
}

struct Node* insert(struct Node* root, int data) {
    if (root == NULL) {
      	return createNode(data);
    }
    
    if (root->data>data) {
    	root->left = insert(root->left, data);
    } else if (root->data < data) {
    	root->right = insert(root->right, data);
    } else {
    	printf("Element already exists!");
    }
    return root;
}

struct Node* deleteNode(struct Node* root, int data) {
    if (root == NULL) {
    	return root;
    }

    if (root->data>data) {
    	root->left = deleteNode(root->left, data);
    } else if (root->data > data) {
    	root->right = deleteNode(root->right, data);
    } else {
    	if (root->left == NULL && root->right == NULL) {
	    free(root);
	    return NULL;
	} else if (root->left == NULL) {
	    struct Node* temp = root->right;
	    free(root);
	    return temp;
	} else if(root->right == NULL) {
	    struct Node* temp = root->left; 
	    free(root);
	    return temp;
	}

	struct Node* temp = minValueNode(root->right);
	root->data = temp->data;
	root->right = deleteNode(root->right, temp->data);
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

void main() {
    int ch, data;
    struct Node* root = NULL;
    do {
    	printf("\n1. Insert\n");
	printf("2. Delete\n");
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
	    case 2:
		printf("Enter the element to delete: ");
		scanf("%d", &data);
		root = deleteNode(root, data);
		break;
	    case 3:
		inorder(root);
		break;
	    case 4:
		printf("Exiting..\n");
		break;
	}
    } while (ch != 4);
}
