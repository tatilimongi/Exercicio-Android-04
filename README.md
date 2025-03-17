# Investment Manager

## Description

The **Investment Manager** project is a simple Android application designed to simulate the management of investments. It allows users to add, calculate returns, and identify investments that require review. The app supports two main types of investments: **Fixed Income** and **Variable Income**, each with its own logic for calculating returns. Investments are displayed in the Logcat, and the system highlights those that require review based on their performance.

## Features

- Add new investments (Fixed Income and Variable Income).
- Calculate the total return of all investments.
- Identify investments that need review based on their return.
- Display investment details in the Logcat.

## Technologies Used

- **Android**: Used to build the application.
- **Java**: Primary programming language.
- **Logcat**: To display information about the investments and returns.

## How to Use

1. Clone the repository or download the project.
2. Open the project in **Android Studio**.
3. Run the application on an emulator or a physical device.
4. The app will output the investment details and returns in the **Logcat**.

### Example of Logcat Output

--LISTA DE INVESTIMENTOS:


| Investment Type | Description               | Invested Amount | Return   | Review Status        |
|-----------------|---------------------------|-----------------|----------|----------------------|
| Fixed Income    | CDB Banco X               | R$5000.00       | R$250.00 |                      |
| Fixed Income    | Tesouro Direto            | R$3000.00       | R$90.00  | Needs Review         |
| Variable Income | Ações TechCorp            | R$7000.00       | R$480.20 |                      |
| Variable Income | Criptomoeda XYZ           | R$2000.00       | R$184.00 | Needs Review         |

--Retorno Total: R$1004.20

--Investimentos que precisam de revisão:

| Investment Type | Description     | Invested Amount | Return   | Review Status |
|-----------------|-----------------|-----------------|----------|---------------|
| Fixed Income    | Tesouro Direto  | R$3000.00       | R$90.00  | Needs Review |
| Variable Income | Criptomoeda XYZ | R$2000.00       | R$184.00 | Needs Review |

## How It Works

1. **Investimentos**: The app uses two main classes to handle investments:
    - `InvestimentoRendaFixa` (Fixed Income Investments)
    - `InvestimentoRendaVariavel` (Variable Income Investments)

2. **Retorno**: Each investment has a calculated return based on a specified rate, and for variable income investments, it accounts for market variation.

3. **Revisão**: Investments that return less than R$100 are flagged for review.

4. **Logcat**: Information about investments, their returns, and the need for review is displayed in the Logcat.

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/investment-manager.git
2. Open the project in Android Studio.

3. Build and run the app.
