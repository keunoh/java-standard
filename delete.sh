#!/bin/bash

find . -type f -name "*.java" | while read file; do
	cp "$file" "${file}.bak"

	sed =i '/^package outer;/d' "$file"

	rm "${file}.bak"
done