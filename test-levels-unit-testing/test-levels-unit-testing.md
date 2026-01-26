# Aufgabe 2

### Wichtige JUnit-5-Features

| Feature                          | Erklärung                                                           | Kurzes Beispiel                                                    |
| -------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------ |
| **@Test**                        | Kennzeichnet eine Methode als ausführbaren Test                     | `@Test void additionTest() { ... }`                                |
| **@BeforeEach**                  | Wird vor jedem einzelnen Test ausgeführt, z. B. zur Initialisierung | `@BeforeEach void setup() { calculator = new Calculator(); }`      |
| **@AfterEach**                   | Wird nach jedem Test aufgerufen, z. B. zum Aufräumen                | `@AfterEach void cleanup() { ... }`                                |
| **@BeforeAll**                   | Läuft einmal vor allen Tests (muss statisch sein)                   | `@BeforeAll static void initAll() { ... }`                         |
| **@AfterAll**                    | Wird einmal nach allen Tests ausgeführt                             | `@AfterAll static void finishAll() { ... }`                        |
| **assertEquals()**               | Vergleicht erwarteten mit effektivem Wert                           | `assertEquals(5, calc.add(2,3));`                                  |
| **assertThrows()**               | Prüft, ob eine bestimmte Exception ausgelöst wird                   | `assertThrows(ArithmeticException.class, () -> calc.divide(4,0));` |
| **assertTrue() / assertFalse()** | Überprüft, ob eine Bedingung wahr oder falsch ist                   | `assertTrue(result >= 0);`                                         |
| **@DisplayName**                 | Gibt einem Test einen verständlichen Namen                          | `@DisplayName("Addition mit positiven Zahlen")`                    |
| **@ParameterizedTest**           | Führt denselben Test mit mehreren Eingabewerten aus                 | `@ValueSource(ints = {1, 2, 5})`                                   |

Referenz Seite: https://docs.junit.org/6.0.2/overview.html

# Aufgabe 3

### Zentrale Klassen der Anwendung

| Klasse                 | Beschreibung                                  | Hauptaufgaben                                             |
| ---------------------- | --------------------------------------------- | --------------------------------------------------------- |
| **Account**            | Stellt ein einzelnes Bankkonto dar            | Einzahlen, Abheben, Kontostand verwalten                  |
| **Bank**               | Zentrale Logik der Simulation                 | Konten verwalten, Transaktionen und Transfers durchführen |
| **Counter**            | Erzeugt fortlaufende, eindeutige Kontonummern | Vergabe neuer Konto-IDs                                   |
| **ExchangeRateOkhttp** | Holt Wechselkurse über eine externe API       | HTTP-Anfrage senden, JSON verarbeiten                     |
| **Main**               | Startpunkt des Programms                      | Initialisiert Bank und führt Beispielabläufe aus          |

### Zusammenspiel der Komponenten

Der Programmablauf startet in der **Main-Klasse**, welche eine **Bank** instanziiert.
Die **Bank** verwaltet mehrere **Account**-Objekte und steuert alle Aktionen wie Einzahlungen, Abhebungen und Überweisungen.
Die eigentlichen Kontobewegungen werden im **Account** durchgeführt.
Falls eine Transaktion mit unterschiedlichen Währungen erfolgt, nutzt die Bank die Klasse **ExchangeRateOkhttp**, um aktuelle Wechselkurse abzurufen.

### Grundlegende Funktionsweise

* Beim Erstellen eines neuen Kontos wird über den **Counter** eine eindeutige Kontonummer generiert.
* Jeder Account speichert und verwaltet seinen eigenen Kontostand.
* Die Bank dient als Schnittstelle für alle Kontooperationen.
* Bei Bedarf werden externe Wechselkurse über eine API abgefragt und verarbeitet.
