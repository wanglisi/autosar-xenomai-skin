cmd_/home/aulef/Documents/Xenomai_BR_installlib/buildroot-2016.08/output/host/usr/arm-buildroot-linux-uclibcgnueabihf/sysroot/usr/include/xen/.install := /bin/bash scripts/headers_install.sh /home/aulef/Documents/Xenomai_BR_installlib/buildroot-2016.08/output/host/usr/arm-buildroot-linux-uclibcgnueabihf/sysroot/usr/include/xen ./include/uapi/xen evtchn.h gntalloc.h gntdev.h privcmd.h; /bin/bash scripts/headers_install.sh /home/aulef/Documents/Xenomai_BR_installlib/buildroot-2016.08/output/host/usr/arm-buildroot-linux-uclibcgnueabihf/sysroot/usr/include/xen ./include/xen ; /bin/bash scripts/headers_install.sh /home/aulef/Documents/Xenomai_BR_installlib/buildroot-2016.08/output/host/usr/arm-buildroot-linux-uclibcgnueabihf/sysroot/usr/include/xen ./include/generated/uapi/xen ; for F in ; do echo "\#include <asm-generic/$$F>" > /home/aulef/Documents/Xenomai_BR_installlib/buildroot-2016.08/output/host/usr/arm-buildroot-linux-uclibcgnueabihf/sysroot/usr/include/xen/$$F; done; touch /home/aulef/Documents/Xenomai_BR_installlib/buildroot-2016.08/output/host/usr/arm-buildroot-linux-uclibcgnueabihf/sysroot/usr/include/xen/.install