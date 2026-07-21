SUMMARY = "Security advisory database for Rust crates"
LICENSE = "CC-BY-4.0 AND CC0-1.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1a8d973e46fb606350485b17c005768e"

PV = "1.0+git"
SRC_URI = "git://github.com/rustsec/advisory-db;protocol=https;branch=main"
# nooelint: oelint.vars.autorev
SRCREV = "${AUTOREV}"

UPSTREAM_CHECK_COMMITS = "1"

inherit allarch
inherit_defer native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    # cargo-deny uses some self-rolled hashing for url names, hence the weird number at the end
    install -d ${D}${datadir}/advisory-db-3157b0e258782691
    cp -Ra ${S}/* ${D}${datadir}/advisory-db-3157b0e258782691
    cp -Ra ${S}/.git ${D}${datadir}/advisory-db-3157b0e258782691/
    chown -R root:root ${D}${datadir}/advisory-db-3157b0e258782691/
}

FILES:${PN} += "${datadir} ${datadir}/advisory-db-3157b0e258782691/.git"
