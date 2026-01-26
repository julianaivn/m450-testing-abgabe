# Übung 1

## Eine Tabelle mit abstrakten Testfällen.

| Nr. | Bedingung                            | Erwarteter Rabatt |
| --- | ------------------------------------ | ----------------- |
| A1  | Kaufpreis < 15’000 CHF               | 0 %               |
| A2  | 15’000 CHF ≤ Kaufpreis ≤ 20’000 CHF  | 5 %               |
| A3  | 20’000 CHF < Kaufpreis < 25’000 CHF  | 7 %               |
| A4  | Kaufpreis ≥ 25’000 CHF               | 8,5 %             |


## Eine Tabelle mit konkreten Testfällen. 

| Nr. | Kaufpreis       | Erwarteter Rabatt |
| --- | --------------- | ----------------- |
| K1  | 14’999          | 0 %               |
| K2  | 15’000          | 5 %               |
| K3  | 18’500          | 5 %               |
| K4  | 20’000          | 5 %               |
| K5  | 20’001          | 7 %               |
| K6  | 24’999          | 7 %               |
| K7  | 25’000          | 8,5 %             |
| K8  | 30’000          | 8,5 %             |




# Übung 2
Website: [rentalcars](https://www.rentalcars.com/de/) 

| ID | Beschreibung | Erwartetes Resultat | Effektives Resultat | Status | Mögliche Ursache |
|----|--------------|--------------------|--------------------|--------|------------------|
| 1  | Benutzer gibt einen Standort ein und startet die Fahrzeugsuche | Verfügbare Fahrzeuge werden in einer Liste angezeigt | – | – | – |
| 2  | Benutzer wählt Abhol- und Rückgabedatum aus | Nur für den gewählten Zeitraum verfügbare Fahrzeuge werden angezeigt | – | – | – |
| 3  | Benutzer öffnet die Detailansicht eines Fahrzeugs | Fahrzeugdetails wie Preis, Modell und Mietbedingungen werden korrekt angezeigt | – | – | – |
| 4  | Benutzer startet den Buchungsvorgang für ein Fahrzeug | Das Buchungsformular wird fehlerfrei geöffnet | – | – | – |
| 5  | Benutzer wählt zusätzliche Fahrer aus | Bei zusätzlichen Fahrern wird ein Zuschlag berechnet, sonst nicht | – | – | – |


# Übung 3

Mögliche Black-Box-Testfälle
| Test | Testfall | Erwartetes Resultat | Effektives Resultat |
|-----:|----------|---------------------|---------------------|
| 1 | Eingabe eines Buchstabens, der nicht im Menü vorhanden ist | Fehlermeldung mit Hinweis zur gültigen Eingabe | Fehlermeldung |
| 2 | Eingabe einer nicht unterstützten Währung | Fehlermeldung wird angezeigt | Fehlermeldung |
| 3 | Eingabe einer Zahl im Nachnamen bei der Kontoerstellung | Fehlermeldung wegen ungültiger Eingabe | Zahl wird gespeichert, keine Fehlermeldung |
| 4 | Eingabe einer bestehenden Kontonummer | Konto wird geladen und Optionen werden angezeigt | Konto wird korrekt angezeigt |
| 5 | Abheben eines Betrags, der höher ist als der Kontostand | Abbruch der Aktion mit Fehlermeldung | Fehlermeldung |
| 6 | Eingabe von „Ü“ für eine Überweisung auf ein anderes Konto | Auswahl des Zielkontos wird angezeigt | Fehlermeldung |

Mögliche White-Box-Testfälle
| Test | Methode | Was wird getestet? | Erwartetes Resultat |
|-----:|---------|-------------------|---------------------|
| 1 | `Account.deposit(double amount)` | Einzahlung eines Betrags auf ein Konto | Kontostand erhöht sich um den eingezahlten Betrag |
| 2 | `Account.withdraw(double amount)` | Abhebung bei ausreichendem bzw. unzureichendem Guthaben | Bei genug Geld: true und Kontostand sinkt, sonst: false und Kontostand bleibt gleich |
| 3 | `Bank.getAccount(int nr)` | Suche eines Kontos anhand der Kontonummer | Existierendes Konto wird zurückgegeben, sonst `null` |
| 4 | `Bank.createAccount(String, Currency, double)` | Erstellen eines neuen Kontos | Konto wird erstellt und der Kontoliste hinzugefügt |
| 5 | `Counter.convertCurrency(...)` | Umrechnung eines Betrags in eine andere Währung | Betrag wird korrekt umgerechnet, sonst unverändert zurückgegeben |

Verbesserungsvorschläge und Best Practices

- Fehlermeldungen hinzufügen
- Eingaben richtig validieren
