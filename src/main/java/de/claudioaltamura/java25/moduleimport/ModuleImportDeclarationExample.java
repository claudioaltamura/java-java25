package de.claudioaltamura.java25.moduleimport;

import module java.base;

//import java.util.ArrayList;
//import java.util.Map;
//import java.util.Objects;
//import java.util.stream.Collectors;

public class ModuleImportDeclarationExample {

    public Map<Integer, String> execute(int initalCapacity) {
        ArrayList<Object> objects = new ArrayList<>(initalCapacity);
        for(int i = 0; i < initalCapacity; i++) {
            objects.add(new Object());
        }

        return objects.stream()
                .collect(Collectors.toMap(Object::hashCode, Objects::toString));
    }
}
