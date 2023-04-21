package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    //You need to have an h1 with the title
    // “Skills Tracker”, an h2, and an ol
    // containing three programming languages
    // of your choosing.
    @GetMapping
    @ResponseBody
    public String createHomepage() {
        return "<html><body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +

                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body></html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String createForm() {
        return "<html><body>" +
                "<form method='post'>" +
                "<label>Name<input type='text' /></label><br>" +
                "<label>My favorite language:" + "<br>" +
                " <select name='favoritelanguage'> id = 'favoritelanguage'" +
                " <option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                " <option value='Python'>Python</option>" +
                "</select>" +
                "</form>" +
                "</body></html>" +
                "<br><label>My second favorite language:" + "<br>" +
                " <select name='secondfavoritelanguage'> id = 'secondfavoritelanguage'" +
                " <option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                " <option value='Python'>Python</option>" +
                "</select>" +
                "</form>" +
                "</body></html>" +
                "<br><label>My third favorite language:" + "<br>" +
                " <select name='thirdfavoritelanguage' id = 'thirdfavoritelanguage'>" +
                " <option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                " <option value='Python'>Python</option>" +
                "</select>" +
                "</form>" + "<br>" +
                "<input type = 'submit' value = 'Submit' />" +
                "</body></html>";
    }

    @PostMapping("/form")
        @ResponseBody
        public String responseToFormSubmit (@RequestParam String name,
                @RequestParam String favoritename,
                @RequestParam String secondfavoritename,
                @RequestParam String thirdfavoritename){
            return
                    "<html><body>" +
                            "<h1>" + name + "</h1>" +
                            "<ol>" +
                            "<li>" + favoritename + "/li>" +
                            "<li>" + secondfavoritename + "</li>" +
                            "<li>" + thirdfavoritename + "</li>" +
                            "</ol>" +
                            "</body></html>"
                    ;
    }
}
