    Hello, observer!

    You are welcome to assess or participate at the project. It has presentation purposes,
as learned technologies are and will be implemented here.
To be inspiring and quite amusing it was creates as an RPG console game.
The executable artifact is situated at "out/artifacts/mine_jar3" location.

    Aspects worth mention
1. Database connectivity properties.

    Code is portable due to encapsulating com.mk.herorpg.DAO connectivity properties in .properties file.
You could just set them to your own (be sure you changed them!!!), according to your DBC driver
and your credentials, as com.mk.herorpg.DAO will be initialized by the program.

2. Dependency Injection

    All classes, that are implementations of the Action abstract class have required dependencies
to function properly. Though, constructor DI would be more suitable.
Although, there are two points for using setter DI
- big amount of dependencies (mostly from 4 to 6) are considered a bad practice to use in constructor,
hence setter DI was used;
- despite dependencies are required, they are consequently injected with literal int or float, sometimes String values.
- great framework was used to minimize template code, so setters were not so abusing.
    Considered this three points, it is decided to use setter DI on all implementation classes of Action.

3. Spring framework

    To unload code coupling and make dependencies more subtle, Spring framework was used.
Moreover, it made code more lightweight and more testable.

4. Lombok framework

    This fancy util generates template getters and setters with @Getter and @Setter annotations
respectively, so a bunch of template code was hidden thanks to it.
