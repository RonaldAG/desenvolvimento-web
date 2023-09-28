# Introdução ao Spring MVC 1 e Thymeleaf

## 1. Thymeleaf

- O Thymeleaf pode ser utilizado em conjunto com o spring.
- Para isso, devemos adicionar a dependência no pom.xml do maven.
- Como estamos usando Spring, as páginas em HTML ficam no resource/static.


O Thymeleaf é utilizado dentro das tags HTML's com a sintaxe semelhante ao exemplo a seguir:

```
  <p th:text=${variável}></p>
```

### 1.1 Principais tags

## 2. Spring MVC x Thymeleaf

Podemos enviar informações tratadas pelo Java para uma página HTML que use Thymeleaf, conforme exemplo a seguir.

No controller:
```
@Controller
@RequestMapping("/inicio")
public class TestController {

	@GetMapping("/hello")
	public ModelAndView helloWorld() {
		String hello = "Hello, world":
		ModelAndView model = new ModelAndView("mensagem-view");
		model.addObject(hello);
		return model;
	}

}
```

No mensagem-view.html:
```
  <p th:text=${hello}></p>
```
