#!/bin/bash

# 작업 디렉토리 내의 Java 파일의 백업 파일을 찾아 원복
find . -type f -name "*.java.bak" | while read backup_file; do
    original_file=${backup_file%.bak}
    
    # 백업 파일에서 원본 파일로 복원
    cp "$backup_file" "$original_file"
    
    # 백업 파일 삭제
    rm "$backup_file"
done
