# parasys
labor: Es soll im Frontend eine Wunschliste aus der Postgres Datenbank angezeigt werden und auch neue wünsche an die REST schnittstelle im Backend gesendet werden.

in docker-fun wird docker compose gebaut
als webserver wird nginx verwendet, dort werden die build dateien eines react projektes eingemapped
die frontendprojektdateien liegen nicht auf git

um docker compose zu updaten muss nach dem build export von react der build ordner in docker-fun / nginx_data kopiert werden
