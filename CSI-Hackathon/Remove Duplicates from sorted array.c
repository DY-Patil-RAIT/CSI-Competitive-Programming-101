#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int nums[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &nums[i]);
    }

    int val;
    scanf("%d", &val);

    int count = 0; // 

    // 
    for (int i = 0; i < n; i++) {
        if (nums[i] != val) {
            nums[count++] = nums[i]; // 
        }
    }

    // 
    printf("%d\n", count);

    // 
    for (int i = 0; i < count; i++) {
        printf("%d ", nums[i]);
    }

    return 0;
}
