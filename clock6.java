import java.time.*;
class clock6
{
ZoneId z=ZoneId.of("Europe/Paris");
Clock c=Clock.tickSeconds(z);
System.out.println(c.instant());
}
}