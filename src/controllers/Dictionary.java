package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    private Map<String, String> dictionarys;

    @GetMapping("/a")
    public String ConverterDictionary(@RequestParam String words, Model model) {
        String result = null;
        dictionarys = new HashMap<>();
        dictionarys.put("hello", "xin chao");
        dictionarys.put("world", "thế giới");
        dictionarys.put("dog", "cho");
        dictionarys.put("cat", "meo");
        for (String i : dictionarys.keySet()) {
            words.equals(i);
            result = dictionarys.get(i);
        }
        model.addAttribute("words", words);
        model.addAttribute("result", result);
        return "index";
    }
}
