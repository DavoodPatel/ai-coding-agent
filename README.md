# 🤖 AI-Powered Autonomous Coding Agent

An AI-powered autonomous coding agent built using **Python and Groq LLMs** that understands bug descriptions in natural language, explores source code using custom tools, identifies potential issues, and attempts to fix bugs automatically.

The agent uses LLM tool calling to search files, inspect relevant code lines, and modify source code without requiring manual intervention.

## 🚀 Features

- **Natural Language Bug Understanding:** Describe programming bugs in simple English through the command-line interface.
- **LLM-Powered Reasoning:** Uses Groq-hosted LLMs to analyze bug descriptions and determine appropriate fixes.
- **Intelligent File Search:** Identifies source files related to the reported bug.
- **Code Inspection:** Searches source files and retrieves relevant code with line numbers.
- **Automated Code Modification:** Replaces specific lines of code using custom tools.
- **Iterative Debugging:** Allows up to 3 attempts to resolve a reported bug.
- **Code Execution Verification:** Includes a compile-and-run verification step.
- **File Restoration:** Restores original files if the agent cannot solve the bug within the retry limit.
- **Transparent Execution:** Displays tool calls, arguments, results, and debugging progress in the terminal.

## 🏗️ Architecture

The project follows a simple tool-calling architecture without using LangChain or LangGraph.

```text
          User
           |
           v
  Describe Bug in English
           |
           v
     Python CLI Agent
           |
           v
       Groq LLM
           |
           v
      Tool Calling
           |
     +-----+------+
     |     |      |
     v     v      v
  Search  Search  Replace
  Files   In File  Line
     |     |      |
     +-----+------+
           |
           v
    Source Code Updated
           |
           v
   Compile & Run Check
           |
      +----+----+
      |         |
    Success   Failure
      |         |
      v         v
 User Review  Retry (Max 3)
      |
      v
   Final Result
```

## 🛠️ Custom Tools

The agent uses three custom Python tools:

| Tool | Description |
|---|---|
| `search_files()` | Searches source files based on keywords related to the reported bug. |
| `search_in_file()` | Finds relevant code and returns matching lines with line numbers. |
| `replace_line()` | Replaces a specific source-code line with updated code. |

These tools allow the LLM to interact with the codebase through controlled file operations.

## 🔄 Agent Workflow

1. The user launches the coding agent.
2. The agent asks the user to describe the bug in natural language.
3. The Groq LLM analyzes the bug description.
4. The LLM calls the appropriate tools to locate and inspect source code.
5. The agent modifies the relevant source-code lines.
6. The application attempts to compile and execute the updated code.
7. The user confirms whether the bug has been fixed.
8. If the issue remains unresolved, the agent attempts another fix, up to the configured retry limit.
9. If all attempts fail, the original files are restored.

## 💻 Technology Stack

- **Language:** Python
- **LLM Provider:** Groq API
- **LLM Model:** `openai/gpt-oss-20b`
- **AI Capability:** LLM Tool Calling / Function Calling
- **Package Management:** uv
- **Environment Management:** python-dotenv
- **Code Execution:** Subprocess

## 📂 Project Structure

```text
ai-coding-agent/
│
├── java_project/
│   └── main.java
│
├── src/
│   └── codeagent/
│       └── __init__.py
│
├── main.py
├── tools.py
├── prompt.md
├── pyproject.toml
├── uv.lock
├── .python-version
├── .gitignore
└── README.md
```

## ⚙️ Installation and Setup

### 1. Clone the repository

```bash
git clone https://github.com/DavoodPatel/ai-coding-agent.git
```

### 2. Navigate to the project directory

```bash
cd ai-coding-agent
```

### 3. Install dependencies

Make sure Python 3.14+ and uv are installed.

```bash
uv sync
```

### 4. Configure the Groq API key

Create a `.env` file in the project root:

```env
GROQ_API_KEY=your_groq_api_key
```

Get your API key from:

https://console.groq.com/

**Important:** Never commit your `.env` file or expose your API key publicly.

## ▶️ Running the Project

Run the coding agent using:

```bash
uv run main.py
```

You can also specify a custom workspace:

```bash
uv run main.py path/to/your/project
```

The agent will ask:

```text
Describe the bug in simple English:
```

Enter your bug description and let the agent analyze and attempt to fix it.

## 🔍 Example Bug Description

```text
The factorial function returns an incorrect result
for some input values. Please identify and fix the issue.
```

The agent will then:

- Search for the relevant source file.
- Inspect the factorial implementation.
- Identify the relevant line.
- Apply a code modification.
- Attempt verification.
- Ask the user whether the bug has been fixed.

## 🧠 Key Engineering Concepts

This project explores several important AI engineering concepts:

- Autonomous AI Agents
- Large Language Models (LLMs)
- Function Calling and Tool Calling
- Prompt Engineering
- Context-Based Code Analysis
- Iterative Reasoning
- Automated Code Modification
- Error Handling and Retry Mechanisms
- File System Operations
- Process Execution using Python Subprocess

## 🔮 Future Improvements

- Support multiple programming languages with language-specific execution.
- Integrate syntax-aware code modification.
- Add unit-test-based validation.
- Improve debugging accuracy using repository context.
- Implement Git-based change tracking and rollback.
- Add support for larger codebases and multi-file debugging.
- Introduce structured logging and debugging reports.

## 👨‍💻 Author

**Davood Patel**

Computer Science & Engineering | Aspiring AI Engineer & Software Developer
