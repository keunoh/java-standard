#!/bin/bash

# 작업 디렉토리 내의 모든 Java 파일에 대해 작업 수행
find . -type f -name "*.java" | while read file; do
    # 원본 파일 백업
    cp "$file" "${file}.bak"
    
    # 패키지 선언 삭제
    sed -i '/^package outer;/d' "$file"
    
    # 백업 파일 삭제
    rm "${file}.bak"
done
