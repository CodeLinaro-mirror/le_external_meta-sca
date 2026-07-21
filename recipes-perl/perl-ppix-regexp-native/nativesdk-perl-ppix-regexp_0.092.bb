SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Artistic-1.0 AND GPL-2.0-only"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "20f57a486bde922794c59a3b44fae1fc"
SRC_URI[sha256sum] = "e9c669c01d7c951f9bfee899c147fc8c8ddd98d3f32329f94000c7b02f53366b"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/PPIx-Regexp-${PV}"

inherit cpan_build
inherit cpan-fixups
inherit_defer nativesdk

do_install:append() {
    # Remove .packlist file, as it contains host specific paths
    # and doesn't serve a real purpose
    find ${D} -name ".packlist" -delete
}
