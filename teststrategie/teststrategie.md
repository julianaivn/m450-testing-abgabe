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
Die Applikation läuft bei Ihnen und Sie können diese testen.

## Identifizieren Sie mögliche Black-Box Testfälle, welche Sie als Benutzer testen können.

## Welche Methoden im Code könnten für White-Box Testfälle verwendet werden?

## Was würden Sie am Code generell verbessern, welche Best Practices fallen Ihnen ein?

## Listen Sie Ihre Testfälle tabellarisch auf in einem Markdown-Dokument und stellen Sie Ihre Lösung in Ihr Repository.
