#include <stdio.h>
#include <stdlib.h> 
int main() {
    int n;
    
    scanf("%d", &n);

    
    int *arr = (int*)malloc(n * sizeof(int));

    
    if (arr == NULL) {
        fprintf(stderr, "Memory allocation failed\n");
        return 1; 
    }

    
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    
    for (int i = n - 1; i >= 0; i--) {
        
        printf("%d", arr[i]);
        
        
        if (i > 0) {
            printf(" ");
        }
    }

    
    printf("\n");

    
    free(arr);

    return 0; 
}