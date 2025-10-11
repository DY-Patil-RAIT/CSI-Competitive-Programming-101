#include <stdio.h>
#include <string.h>

int main() {
    char s[100005];  
    
    fgets(s, sizeof(s), stdin);

    
    size_t len = strlen(s);
    if (s[len - 1] == '\n') {
        s[len - 1] = '\0';
        len--;
    }

    
    for (int i = len - 1; i >= 0; i--) {
        printf("%c", s[i]);
    }

    return 0;
}
