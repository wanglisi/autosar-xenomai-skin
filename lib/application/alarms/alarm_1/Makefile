XENO_CONFIG := CHEMIN_BR/buildroot-2016.08/output/dossier_lib/xeno-config
CFLAGS := $(shell $(XENO_CONFIG) --autosar --cflags)
LDFLAGS := $(shell $(XENO_CONFIG) --autosar --ldflags)
CC := $(shell $(XENO_CONFIG) --cc)

EXECUTABLE := alarm_1

all: $(EXECUTABLE)

%: %.c
	 $(CC) -o $@ $< $(CFLAGS) $(LDFLAGS)

# Pour compiler DESTDIR=CHEMIN_BR/buildroot-2016.08/output/dossier_lib make
