package com.kreitek.items;

import com.kreitek.items.directories.DirectoryItem;

public interface FileSystemItem {
    String getName();
    void setName(String name);
    DirectoryItem getParent();
    void setParent(DirectoryItem directory);
    String getFullPath();
    int getSize();



}
