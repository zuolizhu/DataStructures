package com.zuolizhu.Interfaces.savableInterface;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
