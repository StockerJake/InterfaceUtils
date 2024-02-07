# Define compiler
JAVAC = javac

# Define Java compiler flags
JAVAFLAGS = -g

# Directory for compiled binaries and the JAR file
BINDIR = ./bin

# Directory containing source files
SRCDIR = ./src/main

# Name of the output JAR file
JARFILE = InterfaceUtilities.jar

# Entry point of your Java application
MAINCLASS = InterfaceUtilities

# Creating a classpath (if needed, otherwise remove or leave empty)
CLASSPATH = 

# Compiling the project and packaging it into a JAR
all: $(BINDIR)/$(JARFILE)

$(BINDIR)/$(JARFILE): compile
	echo Main-Class: $(MAINCLASS) > manifest.txt
	jar cvfm $(BINDIR)/$(JARFILE) manifest.txt -C $(BINDIR) .
	rm -f manifest.txt

compile:
	mkdir -p $(BINDIR)
	$(JAVAC) $(JAVAFLAGS) -d $(BINDIR) $(SRCDIR)/InputUtils.java $(SRCDIR)/MenuUtils.java $(SRCDIR)/InterfaceUtilities.java

# Assuming you want to keep a run target to execute the JAR file
run: all
	java -cp $(BINDIR)/$(JARFILE) $(MAINCLASS)

# Clean up
clean:
	rm -rf $(BINDIR)/*.class $(BINDIR)/$(JARFILE)
