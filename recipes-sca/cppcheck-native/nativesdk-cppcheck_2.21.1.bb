SUMMARY = "Static code analyzer for C/C++"
HOMEPAGE = "https://github.com/danmar/cppcheck"
BUGTRACKER = "https://trac.cppcheck.net/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "0BSD AND BSD-2-Clause AND BSD-3-Clause AND GPL-3.0-only"
LIC_FILES_CHKSUM = "\
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
    file://externals/simplecpp/LICENSE;md5=df43620d67c1dceec49343b0b17c385d \
    file://externals/tinyxml2/LICENSE;md5=135624eef03e1f1101b9ba9ac9b5fffd \
    file://externals/picojson/LICENSE;md5=29d6d693711f69885bbfe08072624f2e \
"

SRC_URI = "\
    git://github.com/danmar/cppcheck.git;protocol=https;nobranch=1 \
"
SRCREV = "904cfdcf774c44b17db789c8a212e2f1c69fc833"

inherit pkgconfig
inherit sca-description
inherit_defer nativesdk

LIBZ3 = "nativesdk-z3"

PACKAGECONFIG ??= "z3"
PACKAGECONFIG[z3] = "USE_Z3=yes,,${LIBZ3}"

SCA_TOOL_DESCRIPTION = "cppcheck"

do_compile() {
    oe_runmake ${PACKAGECONFIG_CONFARGS} FILESDIR=.
}

do_install() {
    oe_runmake install DESTDIR=${D} FILESDIR=${datadir} PREFIX=${prefix}
}

FILES:${PN} = "${bindir} ${datadir}"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>\d+\.\d+(\.\d+)*)$"
