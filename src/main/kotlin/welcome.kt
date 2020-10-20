import kotlinx.browser.window
import kotlinx.html.InputType
import kotlinx.html.js.onChangeFunction
import kotlinx.html.js.onClickFunction
import org.w3c.dom.HTMLInputElement
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.br
import react.dom.div
import react.dom.h1
import react.dom.label
import styled.css
import styled.styledDiv
import styled.styledInput

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
        styledInput {
            css {
                +WelcomeStyles.textInput
            }
            attrs {
                type = InputType.text
                placeholder = "Enter Here"
            }
        }
        div { br(){} }
        label { +"Surname: " }
        styledInput {
            css {
                +WelcomeStyles.textInput
            }
            attrs {
                type = InputType.text
                placeholder = "Enter Here"
            }
        }

        div { br(){} }
        label { +"User Name: " }
        styledInput {
            css {
                +WelcomeStyles.textInput
            }
            attrs {
                type = InputType.text
                placeholder = "Enter Here"
            }
        }

        div { br(){} }
        label { +"Password: " }
        styledInput {
            css {
                +WelcomeStyles.textInput
            }
            attrs {
                type = InputType.password
                placeholder = "Enter Here"
            }
        }

        div { br(){} }
        label { +"Email Id: " }
        styledInput {
            css {
                +WelcomeStyles.textInput
            }
            attrs {
                type = InputType.email
                placeholder = "abc@gmail.com"
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

    }
}
