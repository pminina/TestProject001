package com.test001.TestProject001

import org.junit.jupiter.api.Test
import com.codeborne.selenide.Condition.*
import com.codeborne.selenide.Selenide.*

class Lesson002 {
    @Test
    void debugTst() {
        def searchRequest = "Cat"

        open("https://google.com")
        def searchInput = $(By.name("q"))
        searchInput.value = searchRequest
        searchInput.pressEnter()

        def found = $$("@ ires .g")
        assert found.size() > 0
        assert found.first().text.contains(searchRequest)

    }
}
