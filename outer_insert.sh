#!/bin/bash

# 작업 디렉토리 내의 특정 디렉토리에 있는 Java 파일에 대해 작업 수행
find ./src/outer -type f -name "*.java" | while read file; do
    # 원본 파일 백업
    cp "$file" "${file}.bak"
    
    # 패키지 선언 작성
    echo "package outer;" > "$file"
    
    # 원본 파일 내용 추가
    cat "${file}.bak" >> "$file"
    
    # 백업 파일 삭제
    rm "${file}.bak"
done
