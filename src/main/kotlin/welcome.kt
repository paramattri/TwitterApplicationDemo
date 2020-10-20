import kotlinx.browser.window
import kotlinx.css.style
import kotlinx.html.InputType
import kotlinx.html.js.onChangeFunction
import kotlinx.html.js.onClickFunction
import org.w3c.dom.HTMLInputElement
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*
import styled.css
import styled.styledDiv
import styled.styledInput
import styled.styledTextArea

external interface WelcomeProps : RProps {
    var name: String
}

data class WelcomeState(val name: String) : RState

@JsExport
class Welcome(props: WelcomeProps) : RComponent<WelcomeProps, WelcomeState>(props) {

    init {
        state = WelcomeState(props.name)
    }

    override fun RBuilder.render() {
        styledDiv {
            css {
                +WelcomeStyles.textContainer
            }
            h1 { +"Hello, ${state.name}" }
        }

        div { br(){} }
        label { +"First Name:\t" }
        br {  }
        styledInput {
            css {
                +WelcomeStyles.textInput
            }
            attrs {
                type = InputType.text
                placeholder = "Enter First Name Here"
            }
        }
        div { br(){} }
        label { +"Surname: " }
        br {  }
        styledInput {
            css {
                +WelcomeStyles.textInput
            }
            attrs {
                type = InputType.text
                placeholder = "Enter Surname Here"
            }
        }

        div { br(){} }
        label { +"User Name: " }
        br {  }
        styledInput {
            css {
                +WelcomeStyles.textInput
            }
            attrs {
                type = InputType.text
                placeholder = "Enter Username Here"
            }
        }

        div { br(){} }
        label { +"Password: " }
        br {  }
        styledInput {
            css {
                +WelcomeStyles.textInput
            }
            attrs {
                type = InputType.password
                placeholder = "Enter Password Here"
            }
        }

        div { br(){} }
        label { +"Email Id: " }
        br {  }
        styledInput {
            css {
                +WelcomeStyles.textInput
            }
            attrs {
                type = InputType.email
                placeholder = "Enter EmailId Here"
            }
        }

        div { br(){} }
        styledInput {
            css {
                +WelcomeStyles.textInput
            }
            attrs {
                type = InputType.submit
                value = "Submit"
                onClickFunction = { event ->
                    window.alert("You are Successfully Registered!!")
                }
            }
        }

        div { br(){} }
        label { +"Any Feedback?" }
        br {  }
        styledTextArea {
            css {
                +WelcomeStyles.textInput
            }
            attrs {
                placeholder = "Type Here!"
            }
        }
        div{
            br(){}
        }
        div{
            img(src="https://developer.okta.com/assets-jekyll/blog/kotlin-react-crud/kotlin-react-a882e0f5d6556c7f26cf66f86b70e2a4d5fd762aedb707993998162acadf872c.png",alt = "Image Not Found"){
                attrs{
                    height = "120px"
                    width = "150px"
                }
            }
        }

    }
}
