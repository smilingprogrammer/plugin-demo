package com.example.plugindemo;

import com.redhat.devtools.lsp4ij.server.ProcessStreamConnectionProvider;
import java.util.Arrays;
import java.util.List;

public class MyLanguageServer extends ProcessStreamConnectionProvider {

    public MyLanguageServer() {
        List<String> commands = Arrays.asList("abu/file/nodejs/node.exe", "abu/server/main.js");
        super.setCommands(commands);
    }
}